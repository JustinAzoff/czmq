/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Ziflist implements AutoCloseable {
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;

    /*
    Get a list of network interfaces currently defined on the system
    */
    native static long __init ();
    public Ziflist () {
        /*  TODO: if __init fails, self is null...  */
        self = __init ();
    }
    /*
    Destroy a ziflist instance
    */
    native static void __destroy (long self);
    @Override
    public void close() {
        __destroy (self);
        self = 0;
    }
    /*
    Reload network interfaces from system
    */
    native static void __reload (long self);
    public void reload (long self) {
        return Ziflist.__reload (self);
    }
    /*
    Return the number of network interfaces on system
    */
    native static long __size (long self);
    public long size (long self) {
        return Ziflist.__size (self);
    }
    /*
    Get first network interface, return NULL if there are none
    */
    native static String __first (long self);
    public String first (long self) {
        return Ziflist.__first (self);
    }
    /*
    Get next network interface, return NULL if we hit the last one
    */
    native static String __next (long self);
    public String next (long self) {
        return Ziflist.__next (self);
    }
    /*
    Return the current interface IP address as a printable string
    */
    native static String __address (long self);
    public String address (long self) {
        return Ziflist.__address (self);
    }
    /*
    Return the current interface broadcast address as a printable string
    */
    native static String __broadcast (long self);
    public String broadcast (long self) {
        return Ziflist.__broadcast (self);
    }
    /*
    Return the current interface network mask as a printable string
    */
    native static String __netmask (long self);
    public String netmask (long self) {
        return Ziflist.__netmask (self);
    }
    /*
    Return the list of interfaces.
    */
    native static void __print (long self);
    public void print (long self) {
        return Ziflist.__print (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        return Ziflist.__test (verbose);
    }
}