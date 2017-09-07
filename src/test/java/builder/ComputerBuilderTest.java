package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerBuilderTest {

    @Test
    public void test(){
        Computer computerBuilder = new Computer.ComputerBuilder()
                .addGraphic("NiVIDA")
                .addHdd("SDD 1T")
                .addMainboard("Asus H270")
                .addProcessor("Intel i7")
                .addRam("16 gb").build();
    }

    @Test
    public void builderTest(){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();

        builder.addMainboard("Asus b150");
        builder.addRam("8 gb");

        Computer build = builder.build();
    }
}