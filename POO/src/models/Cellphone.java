package models;

import interfaces.MusicPlayer;
import interfaces.Telephone;
import interfaces.Browser;

public class Cellphone implements Browser, MusicPlayer, Telephone{

  private boolean isPlayingMusic;
  private boolean isOnCall;
  private String currentSong;
  private String currentCallNumber;
  private String currentURL;
  private int numberTabs;

  public Cellphone() {
    this.isPlayingMusic = false;
    this.isOnCall = false;
    this.currentSong = "";
    this.currentCallNumber = "";
    this.currentURL = "";
    this.numberTabs = 0;
  }

  // methods for music player
  @Override
  public void pause() {
    this.isPlayingMusic = false;
    System.out.println("Music is paused\n");
  }

  @Override
  public void play() {
    if(this.currentSong.length() == 0){
      System.out.println("No music selected\n");
    }
    else{
      this.isPlayingMusic = true;
      System.out.println("Now playing: " + this.currentSong + "\n");
    }
  }

  @Override
  public void selectMusic(String musicName) {
    this.currentSong = musicName;
    System.out.println(this.currentSong + "selected\n");
  }

  // methods for telephone
  @Override
  public void endCall() {
    this.isOnCall = false;
    System.out.println("The Call ended\n");
  }

  @Override
  public void makeCall(String number) {
    this.currentCallNumber = number;
    this.isOnCall = true;
    System.out.println("you are calling: " + this.currentCallNumber + "\n");
  }

  @Override
  public void makeVoiceMail(String number) {
    this.currentCallNumber = number;
    System.out.println("you are voice mailing: " + this.currentCallNumber + "\n");
  }

  @Override
  public void receiveCall(String number) {
    this.currentCallNumber = number;
    this.isOnCall = true;
    System.out.println("you are receiving a call from: " + this.currentCallNumber + "\n");
  }

  // methods for browser
  @Override
  public void newTab() {
    this.numberTabs++;
    System.out.println("you have opened a new tab, now you have opened " + this.numberTabs + " tabs\n");
  }

  @Override
  public void refresh() {
    String tempURL = this.currentURL;
    this.currentURL = "";
    this.numberTabs--;
    System.out.println("Refreshing: " + tempURL + "\n");
    this.currentURL = tempURL;
    this.numberTabs++;
  }

  @Override
  public void showPage(String url) {
    this.currentURL = url;
    System.out.println("welome to : " + this.currentURL + "where all your dreams come true\n");
  }
  
}
