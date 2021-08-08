package ai.wojciechnowak.app.model

/**
  *
  * @param age - Age of the patient
  * @param sex - Sex of the patient (1 = male; 0 = female)
  * @param cp  - Chest Pain type chest pain type
  *                 Value 1: typical angina
  *                 Value 2: atypical angina
  *                 Value 3: non-anginal pain
  *                 Value 4: asymptomatic)
  * @param rbp - resting blood pressure (in mm Hg)
  * @param chol - cholestoral in mg/dl fetched via BMI sensor
  * @param fbste - fasting blood sugar treshold exceeded (value > 120 mg/dl) (1 = true; 0 = false)
  * @param restecg - resting electrocardiographic results
  *                   Value 0: normal
  *                   Value 1: having ST-T wave abnormality (T wave inversions and/or ST elevation or depression of > 0.05 mV)
  *                   Value 2: showing probable or definite left ventricular hypertrophy by Estes' criteria
  * @param mhr - maximum heart rate
  * @param exng - exercise induced angina (1 = yes; 0 = no)
  * @param output - 1 = heartattack; 2 = no heartattack (?)
  */
case class HeartAttackRecord(age: Int,
                             sex: Int,
                             cp: Int,
                             rbp: Int,
                             chol: Int,
                             fbste: Int,
                             restecg: Int,
                             mhr: Int,
                             exng: Int,
                             output: Int)
