import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getInstance() {
        assertNotNull(Singleton.getInstance());
    }
}