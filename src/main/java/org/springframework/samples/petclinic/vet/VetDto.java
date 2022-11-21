/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.vet;

import java.util.List;
import java.util.Objects;

/**
 * @author Maciej Walkowiak
 */
public final class VetDto {
	private final Long id;
	private final String firstName;
	private final String lastName;
	private final List<Specialty> specialties;

	public VetDto(Long id, String firstName, String lastName, List<Specialty> specialties) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialties = specialties;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Specialty> getSpecialties() {
		return specialties;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VetDto vetDto = (VetDto) o;
		return Objects.equals(id, vetDto.id) && Objects.equals(firstName, vetDto.firstName)
				&& Objects.equals(lastName, vetDto.lastName) && Objects.equals(specialties, vetDto.specialties);
	}

	@Override
	public String toString() {
		return "VetDto{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", specialties=" + specialties + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, specialties);
	}

	public int getNrOfSpecialties() {
		return specialties.size();
	}
}
