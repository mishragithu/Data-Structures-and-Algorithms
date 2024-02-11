    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            Node prev = null;
            for (int i = 0; i < levelCount; i++) {
                Node curNode = queue.poll();

                if (prev != null) {
                    prev.next = curNode;
                }

                prev = curNode;

                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
        }

        return root;
    }
