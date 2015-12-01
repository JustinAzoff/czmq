/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Zframe implements AutoCloseable {
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
    Create a new frame. If size is not null, allocates the frame data
    to the specified size. If additionally, data is not null, copies 
    size octets from the specified data into the frame body.         
    */
    native static long __init (byte [] data, long size);
    public Zframe (byte [] data, long size) {
        /*  TODO: if __init fails, self is null...  */
        self = __init (data, size);
    }
    /*
    Destroy a frame
    */
    native static void __destroy (long self);
    @Override
    public void close() {
        __destroy (self);
        self = 0;
    }
    /*
    Create an empty (zero-sized) frame
    */
    native static Zframe __new_empty ();
    public Zframe new_empty () {
        return Zframe.__new_empty ();
    }
    /*
    Create a frame with a specified string content.
    */
    native static Zframe __from (String string);
    public Zframe from (String string) {
        return Zframe.__from (string);
    }
    /*
    Receive frame from socket, returns zframe_t object or NULL if the recv  
    was interrupted. Does a blocking recv, if you want to not block then use
    zpoller or zloop.                                                       
    */
    native static Zframe __recv (void * source);
    public Zframe recv (void * source) {
        return Zframe.__recv (source);
    }
    /*
    Send a frame to a socket, destroy frame after sending.
    Return -1 on error, 0 on success.                     
    */
    native static int __send (Zframe selfP, void * dest, int flags);
    public int send (Zframe selfP, void * dest, int flags) {
        return Zframe.__send (selfP, dest, flags);
    }
    /*
    Return number of bytes in frame data
    */
    native static long __size (long self);
    public long size (long self) {
        return Zframe.__size (self);
    }
    /*
    Return address of frame data
    */
    native static byte [] __data (long self);
    public byte [] data (long self) {
        return Zframe.__data (self);
    }
    /*
    Create a new frame that duplicates an existing frame. If frame is null,
    or memory was exhausted, returns null.                                 
    */
    native static Zframe __dup (long self);
    public Zframe dup (long self) {
        return Zframe.__dup (self);
    }
    /*
    Return frame data encoded as printable hex string, useful for 0MQ UUIDs.
    Caller must free string when finished with it.                          
    */
    native static String __strhex (long self);
    public String strhex (long self) {
        return Zframe.__strhex (self);
    }
    /*
    Return frame data copied into freshly allocated string
    Caller must free string when finished with it.        
    */
    native static String __strdup (long self);
    public String strdup (long self) {
        return Zframe.__strdup (self);
    }
    /*
    Return TRUE if frame body is equal to string, excluding terminator
    */
    native static boolean __streq (long self, String string);
    public boolean streq (long self, String string) {
        return Zframe.__streq (self, string);
    }
    /*
    Return frame MORE indicator (1 or 0), set when reading frame from socket
    or by the zframe_set_more() method                                      
    */
    native static int __more (long self);
    public int more (long self) {
        return Zframe.__more (self);
    }
    /*
    Set frame MORE indicator (1 or 0). Note this is NOT used when sending
    frame to socket, you have to specify flag explicitly.                
    */
    native static void __set_more (long self, int more);
    public void set_more (long self, int more) {
        return Zframe.__set_more (self, more);
    }
    /*
    Return frame routing ID, if the frame came from a ZMQ_SERVER socket.
    Else returns zero.                                                  
    */
    native static int __routing_id (long self);
    public int routing_id (long self) {
        return Zframe.__routing_id (self);
    }
    /*
    Set routing ID on frame. This is used if/when the frame is sent to a
    ZMQ_SERVER socket.                                                  
    */
    native static void __set_routing_id (long self, int routingId);
    public void set_routing_id (long self, int routingId) {
        return Zframe.__set_routing_id (self, routingId);
    }
    /*
    Return TRUE if two frames have identical size and data
    If either frame is NULL, equality is always false.    
    */
    native static boolean __eq (long self, Zframe other);
    public boolean eq (long self, Zframe other) {
        return Zframe.__eq (self, other);
    }
    /*
    Set new contents for frame
    */
    native static void __reset (long self, byte [] data, long size);
    public void reset (long self, byte [] data, long size) {
        return Zframe.__reset (self, data, size);
    }
    /*
    Send message to zsys log sink (may be stdout, or system facility as       
    configured by zsys_set_logstream). Prefix shows before frame, if not null.
    */
    native static void __print (long self, String prefix);
    public void print (long self, String prefix) {
        return Zframe.__print (self, prefix);
    }
    /*
    Probe the supplied object, and report if it looks like a zframe_t.
    */
    native static boolean __is (void * self);
    public boolean is (void * self) {
        return Zframe.__is (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        return Zframe.__test (verbose);
    }
}