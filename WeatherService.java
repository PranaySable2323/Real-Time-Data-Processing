@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;
    
    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Scheduled(fixedRateString = "${weather.api.interval}")
    public void fetchWeatherData() {
    }

    public List<WeatherSummary> getDailySummaries() {
        return weatherRepository.getDailySummaries();
    }

    public List<WeatherAlert> getAlerts() {
        return weatherRepository.getAlerts();
    }
}
