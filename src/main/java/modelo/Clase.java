package modelo;

import java.time.LocalDateTime;

public class Clase {
  private LocalDateTime time;
  private String message;
public Clase(LocalDateTime time, String message) {
    this.time = time;
    this.message = message;
}
public LocalDateTime getTime() {
    return time;
}
public void setTime(LocalDateTime time) {
    this.time = time;
}
public String getMessage() {
    return message;
}
public void setMessage(String message) {
    this.message = message;
}

}
