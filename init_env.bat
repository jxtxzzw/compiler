@echo off
SET CLASSPATH=.;./antlr-4.7.2-complete.jar;%CLASSPATH%
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun=java org.antlr.v4.gui.TestRig $*
java org.antlr.v4.Tool