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

import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * A simple Stopwatch object for the Joda-Time library.
 * 
 * Example:
 * <pre>
 * {@code
 * Stopwatch stopwatch = Stopwatch.start();
 * ...
 * Duration elapsedTime = stopwatch.getElapsedTime();
 * }
 * </pre>
 * 
 * Stopwatch is thread-safe and immutable.
 * 
 * @author Eric Martin
 */
public class Stopwatch {

	/**
	 * Start instant
	 */
	private final Instant start;
	
	/**
	 * Hidden to prevent construction
	 */
	private Stopwatch() {
		this.start = Instant.now();
	}
	
	/**
	 * Starts a new Stopwatch
	 * @return The Stopwatch
	 */
	public static Stopwatch start() {
		return new Stopwatch();
	}
	
	/**
	 * Gets the time that has elapsed from the start time until now
	 * @return Duration object holding the elapsed time
	 */
	public Duration getElapsedTime() {
		return new Duration(start, Instant.now());
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stopwatch [start=" + start + "]";
	}
}
