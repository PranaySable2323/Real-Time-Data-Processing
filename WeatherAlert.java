public class WeatherAlert {
    private Long id;
    private String condition;
    private boolean triggered;
}

public class WeatherSummary {
    private Date date;
    private double avgTemp;
    private double maxTemp;
    private double minTemp;
    private String dominantCondition;
}
