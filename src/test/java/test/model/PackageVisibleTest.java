package test.model;

import com.avaje.ebean.bean.EntityBean;
import org.junit.Test;
import test.enhancement.BaseTest;

import static org.junit.Assert.assertEquals;

/**
 * Test that beans which have package visibility are enhanced.
 */
public class PackageVisibleTest extends BaseTest {

    @Test
    public void test() {

        // should have EntityBean interface (only)
        Class<?>[] interfaces = UserRoleKey.class.getInterfaces();

        assertEquals(1, interfaces.length);
        assertEquals(EntityBean.class, interfaces[0]);
    }
}
