/*
 * Copyright (c) 2020-2021 Pavel Grigorev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.thepavel.icomponent.demo;

import org.springframework.stereotype.Service;
import org.thepavel.icomponent.demo.annotations.Param;
import org.thepavel.icomponent.demo.annotations.Subject;
import org.thepavel.icomponent.demo.annotations.Template;
import org.thepavel.icomponent.demo.annotations.To;

@Service
public interface EmailService {
  @Subject("email.subject.confirmation")
  @Template("confirmation")
  void sendConfirmation(@Param("username") String username, @Param("link") String link, @To String email);

  @Subject("email.subject.welcome")
  @Template("welcome")
  void sendWelcome(@Param("user") @To User user);
}
