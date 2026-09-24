class PracticeException {
    class MyNewException extends Exception {
        MyNewException(String message) {
            super(message);
        }
    }

    class testException {
        public void testExp() throws MyNewException {
            throw new MyNewException("test");

        }
    }

}