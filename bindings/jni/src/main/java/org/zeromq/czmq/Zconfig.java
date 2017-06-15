/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

public class Zconfig implements AutoCloseable{
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    public long self;
    /*
    Create new config item
    */
    native static long __new (String name, long parent);
    public Zconfig (String name, Zconfig parent) {
        /*  TODO: if __new fails, self is null...            */
        self = __new (name, parent.self);
    }
    public Zconfig (long pointer) {
        self = pointer;
    }
    /*
    Load a config tree from a specified ZPL text file; returns a zconfig_t  
    reference for the root, if the file exists and is readable. Returns NULL
    if the file does not exist.                                             
    */
    native static long __load (String filename);
    public static Zconfig load (String filename) {
        return new Zconfig (__load (filename));
    }
    /*
    Equivalent to zconfig_load, taking a format string instead of a fixed
    filename.                                                            
    */
    native static long __loadf (String format);
    public static Zconfig loadf (String format) {
        return new Zconfig (__loadf (format));
    }
    /*
    Destroy a config item and all its children
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Return name of config item
    */
    native static String __name (long self);
    public String name () {
        return __name (self);
    }
    /*
    Return value of config item
    */
    native static String __value (long self);
    public String value () {
        return __value (self);
    }
    /*
    Insert or update configuration key with value
    */
    native static void __put (long self, String path, String value);
    public void put (String path, String value) {
        __put (self, path, value);
    }
    /*
    Equivalent to zconfig_put, accepting a format specifier and variable
    argument list, instead of a single string value.                    
    */
    native static void __putf (long self, String path, String format);
    public void putf (String path, String format) {
        __putf (self, path, format);
    }
    /*
    Get value for config item into a string value; leading slash is optional
    and ignored.                                                            
    */
    native static String __get (long self, String path, String defaultValue);
    public String get (String path, String defaultValue) {
        return __get (self, path, defaultValue);
    }
    /*
    Set config item name, name may be NULL
    */
    native static void __setName (long self, String name);
    public void setName (String name) {
        __setName (self, name);
    }
    /*
    Set new value for config item. The new value may be a string, a printf  
    format, or NULL. Note that if string may possibly contain '%', or if it 
    comes from an insecure source, you must use '%s' as the format, followed
    by the string.                                                          
    */
    native static void __setValue (long self, String format);
    public void setValue (String format) {
        __setValue (self, format);
    }
    /*
    Find our first child, if any
    */
    native static long __child (long self);
    public Zconfig child () {
        return new Zconfig (__child (self));
    }
    /*
    Find our first sibling, if any
    */
    native static long __next (long self);
    public Zconfig next () {
        return new Zconfig (__next (self));
    }
    /*
    Find a config item along a path; leading slash is optional and ignored.
    */
    native static long __locate (long self, String path);
    public Zconfig locate (String path) {
        return new Zconfig (__locate (self, path));
    }
    /*
    Locate the last config item at a specified depth
    */
    native static long __atDepth (long self, int level);
    public Zconfig atDepth (int level) {
        return new Zconfig (__atDepth (self, level));
    }
    /*
    Add comment to config item before saving to disk. You can add as many
    comment lines as you like. If you use a null format, all comments are
    deleted.                                                             
    */
    native static void __setComment (long self, String format);
    public void setComment (String format) {
        __setComment (self, format);
    }
    /*
    Return comments of config item, as zlist.
    */
    native static long __comments (long self);
    public Zlist comments () {
        return new Zlist (__comments (self));
    }
    /*
    Save a config tree to a specified ZPL text file, where a filename
    "-" means dump to standard output.                               
    */
    native static int __save (long self, String filename);
    public int save (String filename) {
        return __save (self, filename);
    }
    /*
    Equivalent to zconfig_save, taking a format string instead of a fixed
    filename.                                                            
    */
    native static int __savef (long self, String format);
    public int savef (String format) {
        return __savef (self, format);
    }
    /*
    Report filename used during zconfig_load, or NULL if none
    */
    native static String __filename (long self);
    public String filename () {
        return __filename (self);
    }
    /*
    Reload config tree from same file that it was previously loaded from.
    Returns 0 if OK, -1 if there was an error (and then does not change  
    existing data).                                                      
    */
    native static long __reload (long self);
    public int reload () {
        self = __reload (self);
        return 0;
    }
    /*
    Load a config tree from a memory chunk
    */
    native static long __chunkLoad (long chunk);
    public Zconfig chunkLoad (Zchunk chunk) {
        return new Zconfig (__chunkLoad (chunk.self));
    }
    /*
    Save a config tree to a new memory chunk
    */
    native static long __chunkSave (long self);
    public Zchunk chunkSave () {
        return new Zchunk (__chunkSave (self));
    }
    /*
    Load a config tree from a null-terminated string
    */
    native static long __strLoad (String string);
    public Zconfig strLoad (String string) {
        return new Zconfig (__strLoad (string));
    }
    /*
    Save a config tree to a new null terminated string
    */
    native static String __strSave (long self);
    public String strSave () {
        return __strSave (self);
    }
    /*
    Return true if a configuration tree was loaded from a file and that
    file has changed in since the tree was loaded.                     
    */
    native static boolean __hasChanged (long self);
    public boolean hasChanged () {
        return __hasChanged (self);
    }
    /*
    Print properties of object
    */
    native static void __print (long self);
    public void print () {
        __print (self);
    }
    /*
    Self test of this class
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}
