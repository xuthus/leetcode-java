package ru.elcoder.leetcode.models;

public class CountableNode {
    long value;
    int count = 1;
    CountableNode left;
    CountableNode right;

    public CountableNode(long value) {
        this.value = value;
    }

    public CountableNode add(long childValue) {
        if (childValue < value) {
            if (left == null)
                left = new CountableNode(childValue);
            else if (left.count == 1) {
                //rotate
                CountableNode oldLeft = left;
                left = new CountableNode(childValue);
                left.addChild(oldLeft);
            } else
                left = left.add(childValue);
        } else if (childValue > value) {
            if (right == null)
                right = new CountableNode(childValue);
            else if (right.count == 1) {
                //rotate
                CountableNode oldRight = right;
                right = new CountableNode(childValue);
                right.addChild(oldRight);
            } else
                right = right.add(childValue);
        }
        ++count;
        return this;
    }

    public CountableNode addChild(CountableNode child) {
        if (child.value < value) {
            if (left == null)
                left = child;
            else
                left = left.addChild(child);
        } else if (child.value > value) {
            if (right == null)
                right = child;
            else
                right = right.addChild(child);
        }
        count += child.count;
        return this;
    }

    public CountableNode balanceTree() {
        // если одно из плеч больше другого более чем в 2 раза, то балансируем
        int leftCount = left == null ? 0 : left.count;
        int rightCount = right == null ? 0 : right.count;
        if (Math.abs(leftCount - rightCount) < Math.max(8, count << 1))
            return this; // балансировка не нужна
//        System.out.println("balancing...");
        if (rightCount > leftCount) {
            // делаем правое плечо корнем дерева
            CountableNode root = right;
            right = null;
            this.count = this.count - root.count;
            root.addChild(this);
            return root;
        } else {
            // делаем левое плечо корнем дерева
            CountableNode root = left;
            left = null;
            this.count = this.count - root.count;
            root.addChild(this);
            return root;
        }
    }

    public void remove(long childValue) {
        if (value > childValue) {
            if (left == null)
                throw new IllegalArgumentException("value not exists in tree (left)");
            left.remove(childValue);
            if (left.count == 0) left = null;
        } else if (value < childValue) {
            if (right == null)
                throw new IllegalArgumentException("value not exists in tree (right)");
            right.remove(childValue);
            if (right.count == 0) right = null;
        }
        count--;
    }

    public int countBiggerThan(long x) {
        int result = 0;
        if (value > x) {
            result += count - (left == null ? 0 : left.count - left.countBiggerThan(x));
        } else if (value <= x) {
            result = (right == null ? 0 : right.countBiggerThan(x));
        }
        return result;
    }

    public int countLessThan(long x) {
        int result = 0;
        if (value >= x) {
            result = (left == null ? 0 : left.countLessThan(x));
        } else if (value < x) {
            result += count - (right == null ? 0 : right.count - right.countLessThan(x));
        }
        return result;
    }

    public int countLessThanIterative(long x) {
        int result = 0;
        CountableNode node = (value >= x) ? this.left : this.right;
        while (node != null) {
            if (node.value >= x) {

            } else if (node.value < x) {

            } else
                return node.count;
        }
        return result;
    }
}
