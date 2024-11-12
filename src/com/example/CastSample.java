package com.example;

public class CastSample {
    public static void main(String[] args) {
        int int1 = 123456789;
        float float1 = int1;
        System.out.println(STR."int1=：\{int1}"); // int1=：123456789
        System.out.println(STR."float1=：\{float1}"); // float1=：1.2345679E8

        long long1 = 1234567890123456789L;
        float float2 = long1;
        double double1 = long1;

        System.out.println(STR."long1=：\{long1}"); // long1=：1234567890123456789
        System.out.println(STR."float2=：\{float2}"); // float2=：1.234568E18
        System.out.println(STR."double1=：\{double1}"); // double1=：1.2345678901234568E18

        double double2 = 123.0;
        int int2 = (int)double2;
        float float3 = (float)double2;

        System.out.println(STR."double2=：\{double2}"); // double2=：123.0
        System.out.println(STR."int2=：\{int2}"); // int2=：123
        System.out.println(STR."float3=：\{float3}"); // float3=：123.0

        long long2 = 1234567890123456789L;
        int int3 = (int)long2;
        float float4 = 123.45f;
        int int4 = (int)float4;

        System.out.println(STR."long2=：\{long2}"); // long2=：1234567890123456789
        System.out.println(STR."int3=：\{int3}"); // int3=：2112454933
        System.out.println(STR."float4=：\{float4}"); // float4=：123.45
        System.out.println(STR."int4=：\{int4}"); // int4=：123
    }
}
