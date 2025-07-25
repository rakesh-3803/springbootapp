package programs;

import java.util.*;

interface Observer { 
	void update(float temp);
	}

class CurrentCondition implements Observer {
	@Override
    public void update(float temp) {
        System.out.println("Current Temp: " + temp);
    }
}

class AverageTemp implements Observer {
    private List<Float> temps = new ArrayList<>();
    @Override
    public void update(float temp) {
        temps.add(temp);
        float avg = (float) temps.stream().mapToDouble(t -> t).average().orElse(0.0);
        System.out.println("Average Temp: " + avg);
    }
}

class WeatherStation {
    private List<Observer> obs = new ArrayList<>();
    public void addObserver(Observer o) { 
    	obs.add(o); 
    	}
    public void setTemp(float t) { 
    	for (Observer o : obs) 
    		o.update(t); 
    	}
}


class Observ {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.addObserver(new CurrentCondition());
        ws.addObserver(new AverageTemp());
        ws.setTemp(30);
        ws.setTemp(28); 
        ws.setTemp(26);
    }
}
    
