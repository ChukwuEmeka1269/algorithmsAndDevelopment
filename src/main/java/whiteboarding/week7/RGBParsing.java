package whiteboarding.week7;

import whiteboarding.week7.RGB;

import java.util.Map;

public class RGBParsing {
    private final Map<String, String> presetColors;
    public static void main(String[] args) {
//        RGBParsing rgbParsing = new RGBParsing();
    }



    public RGBParsing(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }
    private RGB hexadecimalToRGBConverter(String color) {
        if (color.length() == 4) {
            String red = color.substring(1, 2) + color.substring(1, 2);
            String green = color.substring(2, 3) + color.substring(2, 3);
            String blue = color.substring(3, 4) + color.substring(3, 4);
        }
        String red = color.substring(1, 3);
        String green = color.substring(3, 5);
        String blue = color.substring(5, 7);
        return new RGB(Integer.parseInt(red, 16),
                Integer.parseInt(green, 16),
                Integer.parseInt(blue, 16));
    }
    public RGB parseHexadecimal(String color){
        return hexadecimalToRGBConverter(presetColors.getOrDefault(color.toLowerCase(),color));
    }
}
