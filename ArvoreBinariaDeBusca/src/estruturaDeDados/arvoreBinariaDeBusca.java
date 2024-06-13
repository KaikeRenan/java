package estruturaDeDados;

public class arvoreBinariaDeBusca {

    public no root;

    public class no {
        public int value;
        public no left;
        public no right;

        public  no (int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new no(value);
        } else {
            insert(root, value);
        }
    }

    //inserir item
    private void insert(final no root, final int value) {
        if (root == null) return;
        if (value == root.value) return;
        if (value > root.value) {
            if (root.right == null) root.right = new no(value);
            else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new no(value);
            else insert(root.left, value);
        }
    }

    //contém item?
    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(final no root, final int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

    //remover item
    public int minValue(no currentno) {
        while(currentno.left != null) {
            currentno = currentno.left;
        }
        return currentno.value;
    }

    public void deleteNo(int value) {
        root = deleteNo(root, value);
    }

    private no deleteNo(final no root, final int value) {
        if (root == null) return null;
        if (value < root.value) {
            root.left = deleteNo(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNo(root.right, value);
        } else {
            if ((root.left == null) && (root.right == null)) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNo(root.right, minValue);
            }
        }
        return root;
    }

    //travessia em ordem
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(final no no) {
        //E R D
        if (no == null) return;
        inOrder(no.left);
        System.out.println(no.value);
        inOrder(no.right);
    }

}
