public class SwitchNew {
    public static void main(String[] args) {
        String day = "T";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
             if(day.isEmpty())
                  result = "please insert a valid key";
             else
                result = "looks like a sunday";
             throw new IllegalStateException("invalid day : " + result);
         }   
        };
        System.out.println(result);
    }
    
}