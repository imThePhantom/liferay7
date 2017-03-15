/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nabook.service.friendlyurl;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.nabook.constants.NabookConstants;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
        "javax.portlet.name=" + NabookConstants.PORTLET_NABOOK,
        "com.liferay.portlet.friendly-url-routes=META-INF/configs/routes.xml"
    },
    service = FriendlyURLMapper.class
)
public class NabookFriendlyURLMapper extends DefaultFriendlyURLMapper {

	@Override
	public String getMapping() {
		return _MAPPING;
	}

	private static final String _MAPPING = NabookConstants.NABOOK_MAPPING;

}