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
package org.springframework.samples.petclinic.owner;

import java.util.Objects;
import org.springframework.data.annotation.Id;

/**
 * Can be Cat, Dog, Hamster...
 *
 * @author Juergen Hoeller
 * @author Maciej Walkowiak
 */
public final class PetType {
	private final @Id Long id;

	private final String name;

	public PetType(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PetType{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PetType petType = (PetType) o;
		return Objects.equals(id, petType.id) && Objects.equals(name, petType.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
