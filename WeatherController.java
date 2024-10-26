@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/daily-summary")
    public ResponseEntity<List<WeatherSummary>> getDailySummaries() {
        return ResponseEntity.ok(weatherService.getDailySummaries());
    }
    
    @GetMapping("/alerts")
    public ResponseEntity<List<WeatherAlert>> getAlerts() {
        return ResponseEntity.ok(weatherService.getAlerts());
    }
}
