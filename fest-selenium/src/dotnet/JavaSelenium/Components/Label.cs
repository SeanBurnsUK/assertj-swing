﻿// Date: Oct 15 2009
// Mel Llaguno
// http://www.aclaro.com
// -----------------------------------------
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

using JavaSelenium.Components.Interfaces;

namespace JavaSelenium.Components
{
    public class Label : Component, IHasCoordinates<Label>
    {
        private const string TYPE_STRING = "label";
        private Coordinates _coordinates;

        public Label(string pName) : base(pName, TYPE_STRING)
        {}

        public Label(string pName, string pText) : base(pName, pText, TYPE_STRING)
        {}

        #region Implementation of IHasCoordinates<Label>

        public Coordinates Coordinates()
        {
            if (_coordinates == null)
                _coordinates = new Coordinates(0, 0);
            return _coordinates;
        }

        public Label Coordinates(Coordinates pCoordinates)
        {
            _coordinates = pCoordinates;
            return this;
        }

        #endregion
    }
}