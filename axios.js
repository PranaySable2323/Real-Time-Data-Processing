import axios from 'axios';

const API_URL = "http://localhost:8080/api/weather";

export const getDailySummaries = () => axios.get(`${API_URL}/daily-summary`);
export const getAlerts = () => axios.get(`${API_URL}/alerts`);
