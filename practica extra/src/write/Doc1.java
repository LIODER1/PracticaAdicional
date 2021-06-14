package write;

import java.io.FileNotFoundException;
import java.util.Formatter;


public class Doc1 {

	
private Formatter Doc1;


public Doc1(String Doc1) throws FileNotFoundException{
this.Doc1= new Formatter(Doc1);
}


public void writeByte(byte item) {
this.Doc1.format("%d ", item);
}


public void writeByteLn(byte item) {
this.Doc1.format("%d\n", item);
}


public void writeShort(short item) {
this.Doc1.format("%d ", item);
}


public void writeShortLn(short item) {
this.Doc1.format("%d\n", item);
}


public void writeInt(int item) {
this.Doc1.format("%d ",item);
}


public void writeIntLn(int item) {
this.Doc1.format("%d\n", item);
}


public void writeLong(long item) {
this.Doc1.format("%d ",item);
}


public void writeLongLn(long item) {
this.Doc1.format("%d\n", item);
}


public void writeString(String item) {
this.Doc1.format("%s ", item);
}


public void writeStringLn(String item) {
this.Doc1.format("%s\n", item);
}


public void writeFloat(float item) {
this.Doc1.format("%.2f ", item);
}


public void writeFloatLn(float item) {
this.Doc1.format("%f\n", item);
}


public void writeDouble(double item) {
this.Doc1.format("%f ", item);
}


public void writeDoubleLn(double item) {
this.Doc1.format("%f\n", item);
}


public void writeBoolean(boolean item) {
this.Doc1.format("%b ", item);
}


public void writeBooleanLn(boolean item) {
this.Doc1.format("%b\n", item);
}


public void close() {
this.Doc1.close();
}
}
