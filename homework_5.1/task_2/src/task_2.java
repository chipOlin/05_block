import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        int PATIENT_NUMBER = 30;
        int MIN_TEMP_PATIENT = 32;
        int MAX_TEMP_PATIENT = 40;
        float MIN_TEMP_HEALTHY_PATIENT = 36.2f;
        float MAX_TEMP_HEALTHY_PATIENT = 36.9f;

        float scale = (float) Math.pow(10, 1);
        float sumTemperature = 0;
        int num_healthy_patient = 0;

        float[] tempPatients = new float[PATIENT_NUMBER];
        for(int i = 0; i <= tempPatients.length - 1; i++) {
            float temperature = (float) (Math.random() * (MAX_TEMP_PATIENT - MIN_TEMP_PATIENT)) + MIN_TEMP_PATIENT;
            tempPatients[i] = (float) Math.ceil(temperature * scale) / scale;
            sumTemperature += temperature;
            if(temperature >= MIN_TEMP_HEALTHY_PATIENT && temperature <= MAX_TEMP_HEALTHY_PATIENT) {
                num_healthy_patient++;
            }
        }
        System.out.println("Температуры пациентов: " + Arrays.toString(tempPatients).replaceAll("[\\[\\]]",""));
        System.out.println("Средняя температура: " + Math.ceil((sumTemperature / PATIENT_NUMBER) * scale) / scale);
        System.out.println("Количество здоровых: " + num_healthy_patient);
    }
}
