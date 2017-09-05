package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Computer {

    private String processor;
    private String graphic;
    private String hdd;
    private String ram;
    private String mainboard;


    public static class ComputerBuilder {
        private String processor;
        private String graphic;
        private String hdd;
        private String ram;
        private String mainboard;

        public ComputerBuilder addProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder addGraphic(String graphic) {
            this.graphic = graphic;
            return this;
        }

        public ComputerBuilder addHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder addRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder addMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Computer build(){
            return new Computer(processor, ram, hdd, mainboard, graphic);
        }
    }
}
