package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
public class InfoController {

    @RequestMapping(method = RequestMethod.GET, path = "/health")
    public String health() throws InterruptedException {
    	/*int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
			System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			// feel memoryFillIntVar array in loop..
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: " + iteratorValue);
			Thread.sleep(1000);
		}*/
    	return "OK";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/ready")
    public String ready() {
        return "READY";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/gateway")
    public String gateway() {
        return "OK";
    }
}
