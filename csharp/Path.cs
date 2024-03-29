// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class Path
    {
        [JsonPropertyName("ENTITIES")]
        public IList<Entity> Entities { get; set; }

        [JsonPropertyName("ENTITY_PATHS")]
        public IList<EntityPath> EntityPaths { get; set; }
    }
}
