/*
 * Copyright (c) 2022 Absolute Software Corporation. All rights reserved.
 * Reproduction or transmission in whole or in part, in any form, or by any means
 * (electronic, mechanical, or otherwise) is prohibited without the prior written
 * consent of the copyright owner.
 */
package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
