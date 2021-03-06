/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.applet;

import static org.assertj.swing.test.awt.TestAppletContexts.singletonAppletContextMock;
import static org.assertj.swing.test.awt.TestWindows.singletonWindowMock;

import java.applet.AppletContext;
import java.awt.Window;
import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for {@link BasicAppletStub#BasicAppletStub(java.awt.Window, java.applet.AppletContext, java.util.Map)}.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class BasicAppletStub_constructor_withViewerContextAndMap_Test {
  private static AppletContext context;
  private static Window viewer;

  @BeforeClass
  public static void setUpOnce() {
    context = singletonAppletContextMock();
    viewer = singletonWindowMock();
  }

  @Test(expected = NullPointerException.class)
  public void should_Throw_Error_If_Viewer_Is_Null() {
    new BasicAppletStub(null, context, emptyMap());
  }

  @Test(expected = NullPointerException.class)
  public void should_Throw_Error_If_Context_Is_Null() {
    new BasicAppletStub(viewer, null, emptyMap());
  }

  private static HashMap<String, String> emptyMap() {
    return new HashMap<String, String>();
  }

  @Test(expected = NullPointerException.class)
  public void should_Throw_Error_If_ParameterMap_Is_Null() {
    new BasicAppletStub(viewer, context, null);
  }
}
