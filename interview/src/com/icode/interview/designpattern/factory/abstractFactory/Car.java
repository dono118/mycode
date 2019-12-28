package com.icode.interview.designpattern.factory.abstractFactory;

/**
 * @author Unicorn
 * @create 2019-09-28 22:59
 */
public abstract class Car {
}

abstract class BMW extends Car {}

abstract class Audi extends Car {}

class BMWMPV extends BMW implements MPV {}

class BMWSUV extends BMW implements SUV {}

class AudiMPV extends Audi implements MPV {}

class AudiSUV extends Audi implements SUV {}

interface MPV {}

interface SUV {}
