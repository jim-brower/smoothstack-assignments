class Singleton {
        private static volatile Singleton instance = null;

        private Singleton() {
        }

        // uses a local reference variable to reduce number of accesses to volatile instance
        // synchronizes on the class because its a static context
        public static Singleton getInstance() {
            Singleton ref = instance;
            if (ref == null) {
                synchronized (Singleton.class) {
                    ref = instance;
                    if (ref == null) {
                        instance = ref = new Singleton();
                    }
                }
            }
            return ref;
        }
}