/*
 * Copyright (C) 2013 David Sowerby
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package uk.co.q3c.v7.base.data;

import static org.fest.assertions.Assertions.*;

import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class DateTimeConverterTest {

	DateTimeConverter dtc;

	@Before
	public void setup() {
		dtc = new DateTimeConverter();
	}

	@Test
	public void classes() {

		// given

		// when

		// then
		assertThat(dtc.getModelType()).isEqualTo(DateTime.class);
		assertThat(dtc.getPresentationType()).isEqualTo(Date.class);

	}

	@Test
	public void conversion() {

		// given
		Date d = new Date();
		DateTime dt = new DateTime(d);
		// when
		DateTime dt2 = dtc.convertToModel(d, Locale.UK);
		Date d2 = dtc.convertToPresentation(dt, Locale.UK);
		// then
		assertThat(dt).isEqualTo(dt2);
		assertThat(d).isEqualTo(d2);

	}
}
