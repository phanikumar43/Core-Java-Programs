//Date:-05-08-2026
//Class Program
package com.languagefundamentals;

public class DataTypes1 {
//Byte 
//Byte Supports 1 byte that means 8 bits so 2^7 to 2^7-1 --> -128 to +127
byte b=127;
byte b1=(byte)158;
byte b2=(byte)129;
//Short
//Short supports 16 bits that means 2^16 to 2^16-1 --> -32,768 to +32,767
short s=-32764;
short s1=32760;
short s2=(short)32770;
//Int
//Int supports 32 bits that means 2^31 to 2^16-1 --> -2,14,74,83,648 to +2,14,74,83,647
int i=214748364;
int i1=-214748364;
int i2=(int)214748364;
//long
//Int supports 64 bits that means 2^63 to 2^63-1 --> -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
long l=922337203685477580L;
long l1=-922337203685477585L;
long l2=(long)922337203685477558L;;
//float
//float gives the 5 values after decimal number
float f=5.9f;
float f1=316.6546565651f;
//Double
//Double gives maximum decimal values after the decimal number
double d=4.8;
double d1=595.648948198465;
//Character
//Character can stores either in Letters,And can show characters in numbers
char c='A';
char c1='a';
char c2=68;
char c3=80;
//Boolean
boolean boo=true;
//boolean boo=false;
public static void main(String[] args) {
		DataTypes1 D1=new DataTypes1();
		// Byte 
		System.out.println("Byte is: "+D1.b);
		System.out.println("Byte is: "+D1.b1);
		System.out.println("Byte is: "+D1.b2);
		System.out.println("--------------------------------");
		//Short
		System.out.println("Byte is: "+D1.s);
		System.out.println("Byte is: "+D1.s1);
		System.out.println("Byte is: "+D1.s2);
		System.out.println("--------------------------------");
		//Int
		System.out.println("Int is: "+D1.i);
		System.out.println("Int is: "+D1.i1);
		System.out.println("Int is: "+D1.i2);
		System.out.println("--------------------------------");
		//Long
		System.out.println("Long is: "+D1.l);
		System.out.println("Long is: "+D1.l1);
		System.out.println("Long is: "+D1.i2);
		System.out.println("--------------------------------");
		//Float
		System.out.println("Float is: "+D1.f);
		System.out.println("Float is: "+D1.f1);
		System.out.println("--------------------------------");
		//Double
		System.out.println("Double is: "+D1.d);
		System.out.println("Double is: "+D1.d1);
		System.out.println("--------------------------------");
		//Character
		System.out.println("Character is: "+D1.c);
		System.out.println("Character is: "+D1.c1);
		System.out.println("Character is: "+D1.c2);
		System.out.println("Character is: "+D1.c3);
		System.out.println("--------------------------------");
		if(D1.boo) {
			System.out.println("Good Morning");
		}
	}

}
