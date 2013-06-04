/*
 *  Copyright 2013 Eric Martin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.triptheone.joda;

import junit.framework.Assert;

import org.joda.time.Duration;
import org.junit.Test;

/**
 * Stopwatch JUnit Test
 * 
 * @author Eric Martin
 */
public class StopwatchTest {

	/**
	 * testStart
	 */
	@Test
	public void testStart() {
		Stopwatch stopwatch = Stopwatch.start();
		Assert.assertNotNull(stopwatch);
	}
	
	/**
	 * testGetElapsedTime
	 */
	@Test
	public void testGetElapsedTime() {
		Stopwatch stopwatch = Stopwatch.start();
		Duration elapsedTime = stopwatch.getElapsedTime();
		Assert.assertNotNull(elapsedTime);
		Assert.assertTrue(0 <= elapsedTime.getMillis());
	}
}
