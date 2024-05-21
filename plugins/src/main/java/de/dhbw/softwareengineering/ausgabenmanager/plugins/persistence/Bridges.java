package de.dhbw.softwareengineering.ausgabenmanager.plugins.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.dhbw.softwareengineering.ausgabenmanager.domain.repositories.BridgeRepository;


@Repository
public class Bridges  implements BridgeRepository  {

	@Autowired
	springDataForBridge springDataForBridge;
	
	@Override
	public void deleteById(Long id) {

		
	}

}
