package com.springboot.carefirst.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.carefirst.model.Discount;
import com.springboot.carefirst.repository.DiscountRepository;

@Service
public class DiscountService implements IDiscountService {
	@Autowired
	DiscountRepository discountRepository;

	@Override
	@Transactional
	public String deleteDiscount(Long discountId) {
		// TODO Auto-generated method stub
		Optional<Discount> discount;
		Discount dis;
		try {
			discount = discountRepository.findById(discountId);
		} catch (Exception e) {
			return e.getMessage();
		}
		dis = discount.get();

		return "deleted";
	}

	@Override
	@Transactional
	public String updateDiscount(@Valid Discount discount) {
		Optional<Discount> searchRecord = discountRepository.findById(discount.getDiscountId());
		if (searchRecord.isPresent()) {
			try {

				Discount updateDiscount = searchRecord.get();
				updateDiscount.setIsUsed(discount.getIsUsed());
				// updateDiscount.setPrice(discount.getPrice());
				updateDiscount.setValidDate(discount.getValidDate());

				discountRepository.save(updateDiscount);

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Discount mapping does not exist.";
		}
		return "Discount Information Updated";
	}

	@Override
	@Transactional
	public String addDiscount(@Valid Discount discount) {
		try {
			discountRepository.save(discount);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Discount Info Saved";
	}

	@Override
	@Transactional
	public String getDiscountPrice(@Valid long discountId) {
		Discount discount;

		try {
			discount = discountRepository.findById(discountId).get();
		} catch (Exception e) {
			return e.getMessage();
		}

		return "";
	}

	@Override
	@Transactional
	public String isValid(@Valid long discountId) {
		Discount discount;

		try {
			discount = discountRepository.findById(discountId).get();

		} catch (Exception e) {
			return e.getMessage();
		}

		return discount.getValidDate();
	}

	@Override
	@Transactional
	public String isUsed(@Valid long discountId) {
		Discount discount;

		try {
			discount = discountRepository.findById(discountId).get();

		} catch (Exception e) {
			return e.getMessage();
		}
		if (discount.getIsUsed().equalsIgnoreCase("true"))
			return "used";
		else
			return "not used";
	}

}
