package interfaces;

public interface Telephone {
  public void makeCall(String number);
  public void receiveCall(String number);
  public void endCall();
  public void makeVoiceMail(String number);
}
