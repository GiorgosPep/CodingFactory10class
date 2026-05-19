
Add-Type -AssemblyName System.speech
$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
$speak.SetOutputToWaveFile('voice.wav')
$speak.Speak('Add new files')
$speak.Dispose()

