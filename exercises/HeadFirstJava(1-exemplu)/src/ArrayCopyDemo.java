class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[9];

        System.arraycopy(copyFrom, 0, copyTo, 0, 9);
        System.out.println(new String(copyTo));
    }
}