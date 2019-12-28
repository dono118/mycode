package com.icode.interview.designpattern.decorator.myio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Unicorn
 * @create 2019-09-30 17:57
 */
public class UpperCaseInputStream extends FilterInputStream {

    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) c);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int res = super.read(b, offset, len);
        for (int i = 0; i < res; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return res;
    }
}
