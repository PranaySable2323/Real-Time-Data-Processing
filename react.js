import React, { useEffect, useState } from 'react';
import { getDailySummaries } from '../services/api';

const DailySummary = () => {
    const [summaries, setSummaries] = useState([]);

    useEffect(() => {
        getDailySummaries().then(response => setSummaries(response.data));
    }, []);

    return (
        <div>
            <h2>Daily Summaries</h2>
            <ul>
                {summaries.map(summary => (
                    <li key={summary.date}>{summary.date}: Avg Temp {summary.avgTemp}°C</li>
                ))}
            </ul>
        </div>
    );
};

export default DailySummary;
