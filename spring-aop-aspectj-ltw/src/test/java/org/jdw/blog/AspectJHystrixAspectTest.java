package org.jdw.blog;

import org.jdw.blog.common.CommonTest;
import org.jdw.blog.common.executable.ImplForInterfaceWithAnnotation;
import org.jdw.blog.common.executable.ImplForInterfaceWithoutAnnotation;
import org.jdw.blog.common.executable.InterfaceWithAnnotation;
import org.jdw.blog.common.executable.InterfaceWithoutAnnotation;
import org.jdw.blog.common.executable.NoInterface;
import org.jdw.blog.common.executable.NonAnnotatedImplForInterfaceWithAnnotation;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AspectJHystrixAspectTest extends BaseSpringJUnitTest {

    @Autowired
    @Qualifier("implForInterfaceWithAnnotation")
    private InterfaceWithAnnotation interfaceWithAnnotation;

    @Autowired
    private ImplForInterfaceWithAnnotation implForInterfaceWithAnnotation;

    @Autowired
    private InterfaceWithoutAnnotation interfaceWithoutAnnotation;

    @Autowired
    private ImplForInterfaceWithoutAnnotation implForInterfaceWithoutAnnotation;

    @Autowired
    private NoInterface noInterface;

    @Autowired
    private NonAnnotatedImplForInterfaceWithAnnotation nonAnnotatedImplForInterfaceWithAnnotation;

    @Test
    public void testHystrixWrappedMethod_InterfaceWithAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_(interfaceWithAnnotation, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_InterfaceWithAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testNestedHystrixWrappedMethod_(interfaceWithAnnotation, true);
    }

    @Test
    public void testHystrixWrappedMethod_ImplForInterfaceWithAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_(implForInterfaceWithAnnotation, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_ImplForInterfaceWithAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testNestedHystrixWrappedMethod_(implForInterfaceWithAnnotation, true);
    }

    @Test
    public void testHystrixWrappedMethod_InterfaceWithoutAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_(interfaceWithoutAnnotation, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_InterfaceWithoutAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testNestedHystrixWrappedMethod_(interfaceWithoutAnnotation, true);
    }

    @Test
    public void testHystrixWrappedMethod_ImplForInterfaceWithoutAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_(implForInterfaceWithoutAnnotation, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_ImplForInterfaceWithoutAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testNestedHystrixWrappedMethod_(implForInterfaceWithoutAnnotation, true);
    }

    @Test
    public void testHystrixWrappedMethod_NoInterface() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_Impl(noInterface, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_NoInterface() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testNestedHystrixWrappedMethod_Impl(noInterface, true);
    }

    @Test
    public void testHystrixWrappedMethod_NonAnnotatedImplForInterfaceWithAnnotation() {
        // The HystrixAspect will trigger, wrapping the target method in a new thread.
        CommonTest.testHystrixWrappedMethod_(nonAnnotatedImplForInterfaceWithAnnotation, true);
    }

    @Test
    public void testNestedHystrixWrappedMethod_NonAnnotatedImplForInterfaceWithAnnotation() {
        // The HystrixAspect won't trigger.
        CommonTest.testNestedHystrixWrappedMethod_(nonAnnotatedImplForInterfaceWithAnnotation, false);
    }

}
