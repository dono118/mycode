package com.icode.interview.designpattern.factory.abstractFactory;

/**
 * @author Unicorn
 * @create 2019-09-28 23:16
 */
public interface Factory {
    MPV getMPV();
    SUV getSUV();
}

class BMWFactory implements Factory {

    @Override
    public BMWMPV getMPV() {
        return new BMWMPV();
    }

    @Override
    public BMWSUV getSUV() {
        return new BMWSUV();
    }
}

class AudiFactory implements Factory {

    @Override
    public AudiMPV getMPV() {
        return new AudiMPV();
    }

    @Override
    public AudiSUV getSUV() {
        return new AudiSUV();
    }
}