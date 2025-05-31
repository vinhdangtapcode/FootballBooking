// File: src/main/java/vn/footballfield/service/FieldService.java
package vn.footballfield.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.footballfield.entity.Field;
import vn.footballfield.entity.Owner;
import vn.footballfield.repository.FieldRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class FieldService {

	@Autowired
	private FieldRepository fieldRepository;

	public List<Field> getAllFields() {
		return fieldRepository.findAll();
	}

	public Optional<Field> getFieldById(Integer id) {
		return fieldRepository.findById(id);
	}

	public Field createField(@Valid Field field) {
		return fieldRepository.save(field);
	}

	public Field updateField(Integer id, @Valid Field field) {
		Optional<Field> existing = fieldRepository.findById(id);
		if (existing.isPresent()) {
			Field updated = existing.get();
			updated.setName(field.getName());
			updated.setAddress(field.getAddress());
			updated.setType(field.getType());
			updated.setLength(field.getLength());
			updated.setWidth(field.getWidth());
			updated.setGrassType(field.getGrassType());
			updated.setFacilities(field.getFacilities());
			updated.setPricePerHour(field.getPricePerHour());
			updated.setOpeningTime(field.getOpeningTime());
			updated.setClosingTime(field.getClosingTime());
			// Không cập nhật owner: giữ nguyên chủ sở hữu của sân
			updated.setAvailable(field.getAvailable());
			updated.setOutdoor(field.getOutdoor());
			return fieldRepository.save(updated);
		}
		return null;
	}

	public void deleteField(Integer id) {
		fieldRepository.deleteById(id);
	}

	public List<Field> getFieldsByOwner(Owner owner) {
		return fieldRepository.findByOwner(owner);
	}
}
