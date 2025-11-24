public class SmartHome {
    public static void main(String[] args) {
        // Lambda for motion detection
        Runnable motionTrigger = () -> System.out.println("Motion detected: Lights ON in living room");

        // Lambda for time-based automation
        Runnable timeTrigger = () -> System.out.println("Time is 7 PM: Dim bedroom lights");

        // Lambda for voice command
        Runnable voiceCommand = () -> System.out.println("Voice command 'Party Mode': Activate colorful lights");

        // Execute triggers
        motionTrigger.run();
        timeTrigger.run();
        voiceCommand.run();
    }
} 
