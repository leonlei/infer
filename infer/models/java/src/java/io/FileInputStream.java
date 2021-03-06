/*
* Copyright (c) 2013- Facebook.
* All rights reserved.
*/

package java.io;

import com.facebook.infer.models.InferBuiltins;
import com.facebook.infer.models.InferUndefined;


import java.nio.FileChannelImpl;
import java.nio.channels.FileChannel;

public class FileInputStream extends InputStream {

    private FileDescriptor fd;
    private FileChannel channel;

    private void init() {
        InferBuiltins.__set_file_attribute(this);
    }

    public FileInputStream(String name) throws FileNotFoundException {
        if (InferUndefined.boolean_undefined()) {
            init();
        } else {
            throw new FileNotFoundException();
        }
    }

    public FileInputStream(File file) throws FileNotFoundException {
        if (InferUndefined.boolean_undefined()) {
            init();
        } else {
            throw new FileNotFoundException();
        }
    }

    public FileInputStream(FileDescriptor fdObj) {
        init();
    }

    public FileChannel getChannel() {
        channel = new FileChannelImpl(this, fd, InferUndefined.int_undefined());
        return channel;
    }

    public int available() throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public void close() throws IOException {
        InferBuiltins.__set_mem_attribute(this);
        InferUndefined.can_throw_ioexception_void();
    }

    @Override
    public int read() throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    @Override
    public int read(byte b[]) throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public long skip(int n) throws IOException {
        return InferUndefined.can_throw_ioexception_long();
    }

}
