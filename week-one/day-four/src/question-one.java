class Singleton {
        private static volatile Singleton instance = null;

        private Singleton() {
        }

        // uses a local reference variable to reduce number of accesses to volatile instance
        // synchronizes on the class because its a static context
        public static Singleton getInstance() {
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
}