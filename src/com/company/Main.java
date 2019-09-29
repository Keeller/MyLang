package com.company;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br= (new BufferedReader(new InputStreamReader(System.in)));
            CharStream chs= CharStreams.fromReader(br);
            MyLangeLexer lexer=new MyLangeLexer(chs);
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            MyLangeParser parser=new MyLangeParser(tokens);
            MyLangeBaseListener hl=new MyLangeBaseListener();
            ParseTreeWalker parseTreeWalker=new ParseTreeWalker();
            parseTreeWalker.walk(hl,parser.main());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
